package chemicalcompounds.domain.repository;

import chemicalcompounds.domain.Chemicals;

import java.util.List;

public interface ChemicalsRepository {
    List<Chemicals> getChemicalsRangeId(int startId, int numberOfRecords);

    int count();

    List<Chemicals> getChemicalByName(String name);

    List<String> getRegistrationType();

    List<String> getSubmissionType();

    List<String> getTotalTonnageBand();
}
