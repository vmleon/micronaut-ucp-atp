package micronaut.ucp.atp;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.*;

import javax.inject.Inject;

@Controller("/documents")
public class DocumentController {

    @Inject
    DocumentRepository repository;

    @Get(uri="/")
    public HttpResponse getAll() {
        return HttpResponse.created(repository.findAll());
    }

    @Post(uri = "/")
    public HttpResponse create(@Body Document document) {
        Document newDocument = repository.save(document);
        return HttpResponse.created(newDocument);
    }
}