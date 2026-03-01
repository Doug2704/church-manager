package enums;

import org.springframework.security.core.GrantedAuthority;

public enum Perfil implements GrantedAuthority {

    DEFAULT("Usuário sem perfil atribuido inicialmente."),

    private final String descricao;

    Perfil(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String getAuthority() {
        return name();
    }
}