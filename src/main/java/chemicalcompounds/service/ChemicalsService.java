package chemicalcompounds.service;

import chemicalcompounds.domain.Chemicals;

import java.util.List;

public interface ChemicalsService {
    List<Chemicals> getChemicalsRangeId(int startId, int numberOfRecords);

    int count();

    int minId();

    List<Chemicals> getChemicalByName(String name);

    List<String> getRegistrationType();

    List<String> getSubmissionType();

    List<String> getTotalTonnageBand();

}
