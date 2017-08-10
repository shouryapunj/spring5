package pack;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BdataRepository extends JpaRepository<Bdata, String> {

    /**
     * Returns the number of Bdata entry whose ifsc is given
     * as a method parameter.
     */
    @Query(" SELECT b FROM Bdata b WHERE b.ifsc like %:ifsc%")
    List<Bdata> findByIfsc(@Param("ifsc") String ifsc);



}
