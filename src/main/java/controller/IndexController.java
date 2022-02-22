package controller;

import model.StudentModel;
import persistence.service.StudentService;
import persistence.service.StudentserviceImpl;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.awt.*;
import java.util.List;

//localhost/api/index/hello

@Path("/index")
public class IndexController {

    @Path("/hello")
    @GET
    public void sayHello(){
        System.out.println("Hello World");
    }

   /* @Path("/helo/{name}/{surname}")
    @GET
    public String sayHello(@PathParam("name") String ad, @PathParam("surname") String soyad){
        return "Hello " +ad+" "+soyad;
    }*/

   /* @Path("/hello")
    @GET
    public String sayHello(@QueryParam("name") String ad, @QueryParam("surname") String soyad){
        return "Hello "+ad+" "+soyad;
    }*/

   /* @Path("/hello")
    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    public StudentModel sayHello(){
        StudentModel student = new StudentModel();
        student.setId(100);
        student.setName("Afag");
        student.setSurname("Kamran");

        return student; // new StudentModel(100,"Afag","Kamran");
    }*/

   /* @Path("/hello")
    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    public StudentModel sayHello(@QueryParam("id") Integer id){
        return new StudentModel(id,"Afag","Kamran");
    }*/

    private StudentService studentService = new StudentserviceImpl();

    @Path("/")
    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public List<StudentModel> getAllStudent(){
        return studentService.getAllStudent();
    }

    @Path("/add")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public void add(StudentModel model){
        studentService.addStudent(model);
    }

    @Path("/update")
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public void update(StudentModel model){
        studentService.updateStudent(model);
    }

    @Path("/{id}")
    @DELETE
    public void delete (@PathParam("id") Integer id){
        studentService.deleteStudent(id);
    }
}
