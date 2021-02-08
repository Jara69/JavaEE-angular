package cz.educanet.managers;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

@SessionScoped
public class LoginManager implements Serializable {
    Users loggedUser = null;
}
