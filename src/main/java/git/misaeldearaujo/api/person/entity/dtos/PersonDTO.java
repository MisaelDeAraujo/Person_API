package git.misaeldearaujo.api.person.entity.dtos;

import jakarta.validation.constraints.NotEmpty;

public record PersonDTO(
		@NotEmpty
		String completeName,
		@NotEmpty
		String email,
		@NotEmpty
		String cpf,
		@NotEmpty
		String rg,
		@NotEmpty
		String gender, 
		@NotEmpty
		String cellphone,
		@NotEmpty
		String cep,
		@NotEmpty
		String address, 
		@NotEmpty
		String number,
		@NotEmpty
		String complement,
		@NotEmpty
		String city,
		@NotEmpty
		String district,
		@NotEmpty
		String state,
		@NotEmpty
		String country) {

}
