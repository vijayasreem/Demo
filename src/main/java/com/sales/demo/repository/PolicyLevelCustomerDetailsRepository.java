@Repository
public interface PolicyLevelCustomerDetailsRepository extends JpaRepository<PolicyLevelCustomerDetails, Long> {
    List<PolicyLevelCustomerDetails> findBySearchParameters(String searchParameters);
    PolicyLevelCustomerDetails findByEndorsementProcessing(String endorsementProcessing);
    List<PolicyLevelCustomerDetails> findByRejectionReason(String rejectionReason);
    List<PolicyLevelCustomerDetails> findByNotesForMaker(String notesForMaker);
}