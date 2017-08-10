package pack;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class Services {
    @Autowired
    private BdataRepository bdataRepository;

    @Transactional
    public List<Bdata> getAll(String ifsc){
        return bdataRepository.findByIfsc(ifsc);
    }
}
