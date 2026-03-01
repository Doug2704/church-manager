package br.com.candido.church_manager.DTO;

import jakarta.validation.constraints.*;

public record UsuarioRequestDTO(
        @NotBlank(message = "Nome é obrigatório", groups = OnCreate.class)
        @Pattern(regexp = "^[A-a-zZÀ-ÿ\\s]+$", message = "Utilize apenas letras no nome", groups = OnCreate.class)
        @Size(min = 2, message = "Nome precisa ter, pelo menos, {min} caracteres.")
        String name,

        @NotBlank(message = "Nome de usuário é obrigatório, ele será usado em seu login", groups = OnCreate.class)
        @Size(min = 2, message = "Nome de usuário precisa ter, pelo menos, {min} caracteres.")
        String username,

        @Email(message = "Formato de e-mail inválido. Exemplo: usuario@dominio.com", groups = {OnCreate.class, OnUpdate.class})
        @NotBlank(message = "Email é obrigatório", groups = OnCreate.class)
        String email,

        @NotBlank(message = "Senha é obrigatória", groups = OnCreate.class)
        String password,

        @NotNull(message = "Informe a área de atuação", groups = OnCreate.class)
        Long actuationAreaId,

        Profile profile

) {
}
