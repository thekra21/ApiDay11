import jakarta.ws.rs.core.UriBuilder;
import jakarta.ws.rs.core.UriInfo;
import org.example.Control.JobsController;
import org.example.dao.JobsDAO;
import org.example.models.Jobs;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.net.URI;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class TestJobControl {

    @InjectMocks
    JobsController jobController;
    @Mock
    UriInfo uriInfo;
    @Mock
    JobsDAO dao;

    @Test
    public void TestUpdate() {
        Jobs jobs = new Jobs("It", 6, 4000, 11000);
        URI uri = URI.create("http://localhost/api/jobs/1");

//        when(uriInfo.getAbsolutePathBuilder()).thenReturn(UriBuilder.fromUri(uri));

        Assertions.assertDoesNotThrow(()-> jobController.updateJobs(1,jobs));

    }




}
