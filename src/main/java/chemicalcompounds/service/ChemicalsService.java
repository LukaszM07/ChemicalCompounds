package chemicalcompounds.service;

import chemicalcompounds.domain.Chemicals;

import java.util.List;

public interface ChemicalsService {
    List<Chemicals> getChemicalsRangeId(int startId, int numberOfRecords);

    int count();

    List<Chemicals> getChemicalByName(String name);

    List<String> getRegistrationType();

    List<String> getSubmissionType();

    List<String> getTotalTonnageBand();

    Chemicals getChemicalsById(int chemicalsId);

    List<Chemicals> getChemicalsByEC(String ecNumber);

    List<Chemicals> getChemicalsByRegistrationType(String registrationType);

    List<Chemicals> getChemicalsBySubmissionType(String submissionType);

    List<Chemicals> getChemicalsByTotalTonnageBand(String totalTonnageBand);

    List<Chemicals> getChemicalsByCasNumber(String casNumber);

    List<Chemicals> getChemicalsByFilter(String sql);

    void addChemicals(Chemicals chemicals);

    void editChemicals(Chemicals chemicals);

    void deleteChemicals(int chemicalsId);

    String getSubstanceInformationPage(int chemicalsId);
}
