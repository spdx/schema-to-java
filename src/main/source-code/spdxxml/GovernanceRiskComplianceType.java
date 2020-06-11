
package spdxxml;

import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;

/** 
 * A data type for calculated risk and compliance to governance for a software artifact or source repository
 */
public class GovernanceRiskComplianceType extends ObjectType
{
    private RiskCodeType riskCode;
    private StatementOfAssuranceText statementOfAssuranceText;
    private List<GovernanceRiskComplianceAugmentationPoint> governanceRiskComplianceAugmentationPointList = new ArrayList<GovernanceRiskComplianceAugmentationPoint>();

    /** 
     * Get the 'RiskCode' element value. A data item for the level of risk associated with a software artifact
     * 
     * @return value
     */
    public RiskCodeType getRiskCode() {
        return riskCode;
    }

    /** 
     * Set the 'RiskCode' element value. A data item for the level of risk associated with a software artifact
     * 
     * @param riskCode
     */
    public void setRiskCode(RiskCodeType riskCode) {
        this.riskCode = riskCode;
    }

    /** 
     * Get the 'StatementOfAssuranceText' element value. A data item for a statement of assurance
     * 
     * @return value
     */
    public StatementOfAssuranceText getStatementOfAssuranceText() {
        return statementOfAssuranceText;
    }

    /** 
     * Set the 'StatementOfAssuranceText' element value. A data item for a statement of assurance
     * 
     * @param statementOfAssuranceText
     */
    public void setStatementOfAssuranceText(
            StatementOfAssuranceText statementOfAssuranceText) {
        this.statementOfAssuranceText = statementOfAssuranceText;
    }

    /** 
     * Get the list of 'GovernanceRiskComplianceAugmentationPoint' element items. An augmentation point for GovernanceRiskCalculationType
     * 
     * @return list
     */
    public List<GovernanceRiskComplianceAugmentationPoint> getGovernanceRiskComplianceAugmentationPointList() {
        return governanceRiskComplianceAugmentationPointList;
    }

    /** 
     * Set the list of 'GovernanceRiskComplianceAugmentationPoint' element items. An augmentation point for GovernanceRiskCalculationType
     * 
     * @param list
     */
    public void setGovernanceRiskComplianceAugmentationPointList(
            List<GovernanceRiskComplianceAugmentationPoint> list) {
        governanceRiskComplianceAugmentationPointList = list;
    }
}
