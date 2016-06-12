package chemicalcompounds.service.impl;

import chemicalcompounds.domain.Chemicals;
import chemicalcompounds.domain.repository.ChemicalsRepository;
import chemicalcompounds.service.ChemicalsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChemicalsServiceImpl implements ChemicalsService{
    @Autowired
    private ChemicalsRepository chemicalsRepository;

    public List<Chemicals> getChemicalsRangeId(int startId, int numberOfRecords) {
        return chemicalsRepository.getChemicalsRangeId(startId, numberOfRecords);
    }

    public int count() {
        return chemicalsRepository.count();
    }

    public List<Chemicals> getChemicalByName(String name) {
        return chemicalsRepository.getChemicalByName(name);
    }

    public List<String> getRegistrationType() {
        return chemicalsRepository.getRegistrationType();
    }

    public List<String> getSubmissionType() {
        return chemicalsRepository.getSubmissionType();
    }

    public List<String> getTotalTonnageBand() {
        return chemicalsRepository.getTotalTonnageBand();
    }

    @Override
    public List<Chemicals> getChemicalsByEC(String ecNumber) {
        return chemicalsRepository.getChemicalsByEC(ecNumber);
    }

    @Override
    public List<Chemicals> getChemicalsByRegistrationType(String registrationType) {
        return chemicalsRepository.getChemicalsByRegistrationType(registrationType);
    }

    @Override
    public List<Chemicals> getChemicalsBySubmissionType(String submissionType) {
        return chemicalsRepository.getChemicalsBySubmissionType(submissionType);
    }

    @Override
    public List<Chemicals> getChemicalsByTotalTonnageBand(String totalTonnageBand) {
        return chemicalsRepository.getChemicalsByTotalTonnageBand(totalTonnageBand);
    }

}
