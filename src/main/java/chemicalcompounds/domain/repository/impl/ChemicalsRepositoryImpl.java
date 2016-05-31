package chemicalcompounds.domain.repository.impl;

import chemicalcompounds.domain.Chemicals;
import chemicalcompounds.domain.repository.ChemicalsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class ChemicalsRepositoryImpl implements ChemicalsRepository{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Chemicals> getChemicalsRangeId(int startId, int numberOfRecords) throws EmptyResultDataAccessException {
        startId += minId();
        return jdbcTemplate.query("SELECT * FROM Chemicals WHERE id >= ? AND id < ?", new ChemicalsRowMapper(), startId, (startId + numberOfRecords));
    }

    public int count() throws EmptyResultDataAccessException {
        return jdbcTemplate.queryForObject("SELECT count(*) FROM Chemicals", Integer.class);
    }

    public int minId() {
        return jdbcTemplate.queryForObject("SELECT min(id) FROM Chemicals", Integer.class);
    }

    public List<Chemicals> getChemicalByName(String name) throws EmptyResultDataAccessException{
        return jdbcTemplate.query("SELECT * FROM Chemicals WHERE name like ?", new ChemicalsRowMapper(), name);
    }

    public List<String> getRegistrationType() {
        return jdbcTemplate.queryForList("select Chemicals.registration_type from Chemicals group by Chemicals.registration_type", String.class);
    }

    public List<String> getSubmissionType() {
        return jdbcTemplate.queryForList("select Chemicals.submission_type from Chemicals group by Chemicals.submission_type", String.class);
    }

    public List<String> getTotalTonnageBand() {
        return jdbcTemplate.queryForList("select Chemicals.total_tonnage_band from Chemicals group by Chemicals.total_tonnage_band", String.class);
    }

    private static class ChemicalsRowMapper implements RowMapper<Chemicals> {
        public Chemicals mapRow(ResultSet rs, int rowNum) throws SQLException {
            Chemicals chemicals = new Chemicals();

            chemicals.setId(rs.getInt("id"));
            chemicals.setName(rs.getString("name"));
            chemicals.setEc(rs.getString("ec"));
            chemicals.setCasNumber(rs.getString("cas_number"));
            chemicals.setRegistrationType(rs.getString("registration_type"));
            chemicals.setSubmissionType(rs.getString("submission_type"));
            chemicals.setTotalTonnageBand(rs.getString("total_tonnage_band"));
            chemicals.setFactsheetURL(rs.getString("factsheet_url"));
            chemicals.setSubstanceInformationPage(rs.getString("substance_information_page`"));

            return chemicals;
        }
    }

}
