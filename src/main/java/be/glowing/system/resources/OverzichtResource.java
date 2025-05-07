package be.glowing.system.resources;

import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("/overzicht")
public class OverzichtResource {

    @Inject
    Template overzicht;

    @GET
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance get(){
        return overzicht.instance();
    }
}
