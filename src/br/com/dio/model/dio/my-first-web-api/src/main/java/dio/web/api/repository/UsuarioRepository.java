package dio.web.api.repository;

import dio.web.api.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioRepository {

    public void save(Usuario usuario) {
        if (usuario.getId() == null) {

            System.out.println("SAVE - recebendo o usuario na camada de repositorio...");

        }else {

            System.out.println("UPDATE - recebendo o usuario na camada re repositorio...");

        }
        System.out.println(usuario);

    }
    public void deleteById(Integer id){

        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuario..", id));
        System.out.println(id);
    }

    public List<Usuario> findAll(){

        System.out.println("LIST - Listando os usuarios do sistema");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("Vinicius", "12345678"));
        usuarios.add(new Usuario("frank","masterplass"));

        return usuarios;
    }
    public Usuario findById(Integer id){

        System.out.println(String.format("FIND/id - recebendo o id %d para localizar um usuario..."));
        return new Usuario("Vinicius", "12345678");
    }

    public Usuario findByUsername(String username){

        System.out.println(String.format("FIND/username - recebendo username..."));
        return new Usuario("Vinicius","12345678");
    }
}

