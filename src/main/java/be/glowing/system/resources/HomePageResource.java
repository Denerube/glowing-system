package be.glowing.system.resources;
import be.glowing.system.models.User;
import be.glowing.system.services.UserService;
import io.quarkus.qute.CheckedTemplate;
import io.quarkus.qute.TemplateInstance;
import io.smallrye.common.annotation.Blocking;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.Collection;
import java.util.List;

@Path("/home")
public class HomePageResource {

    @Inject
    UserService userService;

    @GET
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance get(){
        return Templates.index();
    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    @Path("/get")
    @Blocking
    public TemplateInstance getReservations() {
        List<User> reviewers  = userService.getAllActiveReviewers();
        return Templates.reviewers(reviewers);
    }



    @CheckedTemplate
    public static class Templates {
        public static native TemplateInstance index();
        public static native TemplateInstance reviewers(Collection<User> reviewers);

    }
}
