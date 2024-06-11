import jakarta.inject.Inject;
import org.example.dao.JobsDAO;
import org.example.models.Jobs;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.sql.SQLException;


@ExtendWith(MockitoExtension.class)
public class TestJobDao {
    @InjectMocks
    JobsDAO dao;

@Test
public void testUpdetJobs () throws SQLException, ClassNotFoundException {

    Jobs j =new Jobs("test",19, 4200,9000);

    Assertions.assertDoesNotThrow(()->dao.updateJobs(j));

    Jobs Njob = dao.selectJobs(j.getJob_id());

    Assertions.assertNotNull(Njob);
    Assertions.assertEquals(Njob.getJob_id(),j.getJob_id());
    Assertions.assertEquals(Njob.getMax_sal() ,j.getMax_sal());




}
}
