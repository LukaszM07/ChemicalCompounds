package chemicalcompounds.domain;

public class Chemicals {
    private int id;
    private String name;
    private String ec;
    private String casNumber;
    private String registrationType;
    private String submissionType;
    private String totalTonnageBand;
    private String factsheetURL;
    private String substanceInformationPage;

    public Chemicals() {
    }

    public Chemicals(String name, String ec, String casNumber, String registrationType, String submissionType, String totalTonnageBand, String factsheetURL, String substanceInformationPage) {
        this.name = name;
        this.ec = ec;
        this.casNumber = casNumber;
        this.registrationType = registrationType;
        this.submissionType = submissionType;
        this.totalTonnageBand = totalTonnageBand;
        this.factsheetURL = factsheetURL;
        this.substanceInformationPage = substanceInformationPage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Chemicals chemicals = (Chemicals) o;

        if (name != null ? !name.equals(chemicals.name) : chemicals.name != null) return false;
        if (ec != null ? !ec.equals(chemicals.ec) : chemicals.ec != null) return false;
        if (casNumber != null ? !casNumber.equals(chemicals.casNumber) : chemicals.casNumber != null) return false;
        if (registrationType != null ? !registrationType.equals(chemicals.registrationType) : chemicals.registrationType != null)
            return false;
        if (submissionType != null ? !submissionType.equals(chemicals.submissionType) : chemicals.submissionType != null)
            return false;
        if (totalTonnageBand != null ? !totalTonnageBand.equals(chemicals.totalTonnageBand) : chemicals.totalTonnageBand != null)
            return false;
        if (factsheetURL != null ? !factsheetURL.equals(chemicals.factsheetURL) : chemicals.factsheetURL != null)
            return false;
        return substanceInformationPage != null ? substanceInformationPage.equals(chemicals.substanceInformationPage) : chemicals.substanceInformationPage == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (ec != null ? ec.hashCode() : 0);
        result = 31 * result + (casNumber != null ? casNumber.hashCode() : 0);
        result = 31 * result + (registrationType != null ? registrationType.hashCode() : 0);
        result = 31 * result + (submissionType != null ? submissionType.hashCode() : 0);
        result = 31 * result + (totalTonnageBand != null ? totalTonnageBand.hashCode() : 0);
        result = 31 * result + (factsheetURL != null ? factsheetURL.hashCode() : 0);
        result = 31 * result + (substanceInformationPage != null ? substanceInformationPage.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Chemicals{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ec='" + ec + '\'' +
                ", casNumber='" + casNumber + '\'' +
                ", registrationType='" + registrationType + '\'' +
                ", submissionType='" + submissionType + '\'' +
                ", totalTonnageBand='" + totalTonnageBand + '\'' +
                ", factsheetURL='" + factsheetURL + '\'' +
                ", substanceInformationPage='" + substanceInformationPage + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEc() {
        return ec;
    }

    public void setEc(String ec) {
        this.ec = ec;
    }

    public String getCasNumber() {
        return casNumber;
    }

    public void setCasNumber(String casNumber) {
        this.casNumber = casNumber;
    }

    public String getRegistrationType() {
        return registrationType;
    }

    public void setRegistrationType(String registrationType) {
        this.registrationType = registrationType;
    }

    public String getSubmissionType() {
        return submissionType;
    }

    public void setSubmissionType(String submissionType) {
        this.submissionType = submissionType;
    }

    public String getTotalTonnageBand() {
        return totalTonnageBand;
    }

    public void setTotalTonnageBand(String totalTonnageBand) {
        this.totalTonnageBand = totalTonnageBand;
    }

    public String getFactsheetURL() {
        return factsheetURL;
    }

    public void setFactsheetURL(String factsheetURL) {
        this.factsheetURL = factsheetURL;
    }

    public String getSubstanceInformationPage() {
        return substanceInformationPage;
    }

    public void setSubstanceInformationPage(String substanceInformationPage) {
        this.substanceInformationPage = substanceInformationPage;
    }
}