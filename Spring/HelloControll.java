import java.io.IOException;


@Controller
public lcass HelloControll{
    @RequestMapping
    public void hello(HttpServLetResponse response) throws IOException {
        response.getWriter().print("hello world");
    }
    
}