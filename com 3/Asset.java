/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package question2;

import oop.exams.staffmember.StaffMember;

/**
 *
 * @author karab
 */
public class Asset {

    private String AssetNumber;
    private String serialNumber;
    private String deviceDescription;
    private StaffMember assignedTO;

    public Asset(String AssetNumber, String serialNumber, String deviceDescription) {
        this.AssetNumber = AssetNumber;
        this.serialNumber = serialNumber;
        this.deviceDescription = deviceDescription;
    }

    public Asset(String AssetNumber, String serialNumber, String deviceDescription, StaffMember assignedTO) {
        this.AssetNumber = AssetNumber;
        this.serialNumber = serialNumber;
        this.deviceDescription = deviceDescription;
        this.assignedTO = assignedTO;
    }

    public Asset(String AssetNumber, String serialNumber, String deviceDescription, StaffMember assignedTO, int officeNumber, int building) {
        this.AssetNumber = AssetNumber;
        this.serialNumber = serialNumber;
        this.deviceDescription = deviceDescription;
        this.assignedTO = assignedTO;
    }

    public StaffMember getAssignedTO() {
        return assignedTO;
    }

    public void setAssignedTO(StaffMember assignedTO) {
        this.assignedTO = assignedTO;
    }

    public String assetDetails() {
        return """
               the asset details
               asset Number: """ + AssetNumber + "\n"
                + "Descreption: " + deviceDescription + "\n"
                + "Serial Number: " + serialNumber + "\n"
                + "Asset Assigned to: StaffMember{staffNumber=" + assignedTO.getStaffNumber()
                + ",surname+" + assignedTO.getSurname()
                + ",officeNumber=" + assignedTO.getOfficeNumber()
                + ",building=" + assignedTO.getBuilding() + "}";
    }

}
