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
        return jdbcTemplate.query("SELECT * FROM Chemicals WHERE id >= ? AND id < ?", new ChemicalsRowMapper(), startId, (startId + numberOfRecords));
    }

    @Override
    public List<Chemicals> getChemicalsByEC(String ecNumber) {
        return jdbcTemplate.query("SELECT * FROM Chemicals WHERE Chemicals.ec LIKE ?", new ChemicalsRowMapper(), ecNumber);
    }

    @Override
    public List<Chemicals> getChemicalsByRegistrationType(String registrationType) {
        return jdbcTemplate.query("SELECT * FROM Chemicals WHERE Chemicals.registration_type LIKE ?", new ChemicalsRowMapper(), registrationType);
    }

    @Override
    public List<Chemicals> getChemicalsBySubmissionType(String submissionType) {
        return jdbcTemplate.query("SELECT * FROM Chemicals WHERE Chemicals.submission_type LIKE ?", new ChemicalsRowMapper(), submissionType);
    }

    @Override
    public List<Chemicals> getChemicalsByTotalTonnageBand(String totalTonnageBand) {
        return jdbcTemplate.query("SELECT * FROM Chemicals WHERE Chemicals.total_tonnage_band LIKE ?", new ChemicalsRowMapper(), totalTonnageBand);
    }

    @Override
    public List<Chemicals> getChemicalsByCasNumber(String casNumber) {
        return jdbcTemplate.query("SELECT * FROM Chemicals WHERE Chemicals.cas_number LIKE ?", new ChemicalsRowMapper(), casNumber);
    }

    @Override
    public List<Chemicals> getChemicalsByFilter(String sql) {
        return jdbcTemplate.query(sql, new ChemicalsRowMapper());
    }

    @Override
    public Chemicals getChemicalsById(int chemicalsId) {
        return jdbcTemplate.queryForObject("SELECT * FROM Chemicals WHERE id = ?", new ChemicalsRowMapper(), chemicalsId);
    }

    @Override
    public void addChemicals(Chemicals chemicals) {
        String sql = "INTO public.chemicals(name, ec, cas_number, registration_type, submission_type, total_tonnage_band, substanceinformation_page) VALUES (?, ?, ?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql, chemicals.getName(), chemicals.getEc(), chemicals.getCasNumber(), chemicals.getRegistrationType(), chemicals.getSubmissionType(), chemicals.getTotalTonnageBand(), chemicals.getSubstanceInformationPage());
    }

    @Override
    public void editChemicals(Chemicals chemicals) {
        String sql = "UPDATE public.chemicals SET name = ?, ec = ?, cas_number = ?, registration_type = ?, submission_type = ?, total_tonnage_band = ?, substanceinformation_page = ? WHERE id = ?";
        jdbcTemplate.update(sql, chemicals.getName(), chemicals.getEc(), chemicals.getCasNumber(), chemicals.getRegistrationType(), chemicals.getSubmissionType(), chemicals.getTotalTonnageBand(), chemicals.getSubstanceInformationPage());
    }

    @Override
    public void deleteChemicals(int chemicalsId) {
        jdbcTemplate.update("DELETE FROM public.chemicals WHERE id = ?", chemicalsId);
    }

    public int count() throws EmptyResultDataAccessException {
        return jdbcTemplate.queryForObject("SELECT count(*) FROM Chemicals", Integer.class);
    }

    public List<Chemicals> getChemicalByName(String name) throws EmptyResultDataAccessException{
        return jdbcTemplate.query("SELECT * FROM Chemicals WHERE name LIKE ?", new ChemicalsRowMapper(), "%" + name + "%");
    }

    public List<String> getRegistrationType() {
        return jdbcTemplate.queryForList("SELECT Chemicals.registration_type FROM Chemicals GROUP BY Chemicals.registration_type", String.class);
    }

    public List<String> getSubmissionType() {
        return jdbcTemplate.queryForList("SELECT Chemicals.submission_type FROM Chemicals GROUP BY Chemicals.submission_type", String.class);
    }

    public List<String> getTotalTonnageBand() {
        return jdbcTemplate.queryForList("SELECT Chemicals.total_tonnage_band FROM Chemicals GROUP BY Chemicals.total_tonnage_band", String.class);
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
            chemicals.setSubstanceInformationPage(rs.getString("substanceinformation_page"));

            return chemicals;
        }
    }

}
