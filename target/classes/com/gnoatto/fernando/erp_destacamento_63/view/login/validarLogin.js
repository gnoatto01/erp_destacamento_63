let botao = document.getElementById('btnEntrar');

botao.addEventListener('click', function logar() {
    let usuarios;

    fetch('http://localhost:8080/usuarios/listar')
        .then(response => response.json())
        .then(data => {
            console.log('Dados recebidos:', data);
            usuarios = data;

            let usuario = document.getElementById('campoUsuario').value;
            let senha = document.getElementById('campoSenha').value;
            let validaLogin = false;
            let textForm = document.getElementById('textForm')

            if (usuario.value == ' ' && senha == ' ') {
                textForm.textContent = "Necessário preencher todos os campos..."
            }

            for (let i in usuarios) {

                if(usuario == "" || senha == "") {
                    alert("Preencha todos os campos...");
                    break;
                }

                else if (usuario == usuarios[i].usuario && senha == usuarios[i].senha) {
                    validaLogin = true;
                    break;
                }

            }

            if (validaLogin) {
                alert('Logado com sucesso');
            }
            
        })
        .catch(error => console.error('Erro na requisição:', error));
});






