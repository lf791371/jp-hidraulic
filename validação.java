function toggleCNPJField() {
    var pessoa = document.getElementById('pessoa');
    var cnpjField = document.getElementById('cnpj-field');
    var empresaField = document.getElementById('empresa-field');

    // Se a opção selecionada for 'juridica'
    if (pessoa.value === 'juridica') {
        // Se o campo CNPJ ainda não existir, crie-o
        if (!cnpjField) {
            cnpjField = document.createElement('div');
            cnpjField.classList.add('form-group');
            cnpjField.id = 'cnpj-field';
            cnpjField.innerHTML = `
                <label for="cnpj">CNPJ</label>
                <input type="text" id="cnpj" name="cnpj" required aria-label="CNPJ">
            `;
            // Insere antes do último campo existente no formulário
            document.querySelector('form').appendChild(cnpjField);
        }

        // Se o campo Empresa ainda não existir, crie-o
        if (!empresaField) {
            empresaField = document.createElement('div');
            empresaField.classList.add('form-group');
            empresaField.id = 'empresa-field';
            empresaField.innerHTML = `
                <label for="empresa">Nome da Empresa</label>
                <input type="text" id="empresa" name="empresa" required aria-label="Nome da Empresa">
            `;
            // Insere o campo após o CNPJ
            document.querySelector('form').appendChild(empresaField);
        }

        // Torna os campos obrigatórios
        document.getElementById('cnpj').setAttribute('required', 'required');
        document.getElementById('empresa').setAttribute('required', 'required');
    } else {
        // Remove os campos se a opção selecionada for 'fisica'
        if (cnpjField) {
            cnpjField.remove();
        }
        if (empresaField) {
            empresaField.remove();
        }
    }
}

