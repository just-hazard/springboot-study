package just.hazard.springboot.controller;

import just.hazard.springboot.entity.Hateoas;
import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;


@RestController
public class HateoasController{

    @GetMapping("/hateoas")
    public EntityModel<Hateoas> hateoas() {
        Hateoas hateoas = new Hateoas();
        hateoas.setPrefix("hi");
        hateoas.setName("seop");

        EntityModel<Hateoas> resource = new EntityModel<>(hateoas);
        resource.add(linkTo(methodOn(HateoasController.class).hateoas()).withSelfRel());

        return resource;
    }
}
