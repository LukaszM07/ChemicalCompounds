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
        return jdbcTemplate.query("SELECT * FROM `Chemicals` WHERE `id` >= ? AND `id` < ?", new ChemicalsRowMapper(), startId, (startId + numberOfRecords));
    }

    public int count() throws EmptyResultDataAccessException {
        return jdbcTemplate.queryForObject("SELECT count(*) FROM `Chemicals`", Integer.class);
    }

    public int minId() {
        return jdbcTemplate.queryForObject("SELECT min(id) FROM `Chemicals`", Integer.class);
    }

    public List<Chemicals> getChemicalByName(String name) throws EmptyResultDataAccessException{
        return jdbcTemplate.query("SELECT * FROM `Chemicals` WHERE `name` like ?", new ChemicalsRowMapper(), name);
    }

    public List<String> getRegistrationType() {
        return jdbcTemplate.queryForList("select `Chemicals`.`Registration Type` from Chemicals group by `Chemicals`.`Registration Type`", String.class);
    }

    public List<String> getSubmissionType() {
        return jdbcTemplate.queryForList("select `Chemicals`.`Submission Type` from Chemicals group by `Chemicals`.`Submission Type`", String.class);
    }

    public List<String> getTotalTonnageBand() {
        return jdbcTemplate.queryForList("select `Chemicals`.`Total tonnage Band` from Chemicals group by `Chemicals`.`Total tonnage Band`", String.class);
    }

    private static class ChemicalsRowMapper implements RowMapper<Chemicals> {
        public Chemicals mapRow(ResultSet rs, int rowNum) throws SQLException {
            Chemicals chemicals = new Chemicals();

            chemicals.setId(rs.getInt("id"));
            chemicals.setName(rs.getString("Name"));
            chemicals.setEc(rs.getString("`EC / List Number`"));
            chemicals.setCasNumber(rs.getString("`Cas Number`"));
            chemicals.setRegistrationType(rs.getString("`Registration Type`"));
            chemicals.setSubmissionType(rs.getString("`Submission Type`"));
            chemicals.setTotalTonnageBand(rs.getString("`Total tonnage Band`"));
            chemicals.setFactsheetURL(rs.getString("`Factsheet URL`"));
            chemicals.setSubstanceInformationPage(rs.getString("`Substance Information Page`"));

            return chemicals;
        }
    }

}
