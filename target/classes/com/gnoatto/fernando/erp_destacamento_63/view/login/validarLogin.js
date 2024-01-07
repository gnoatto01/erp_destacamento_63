const usuarios = [
    {
        usuario: 'admin',
        senha: 'admin'
    }
]

let botao = document.getElementById('btnEntrar')

botao.addEventListener('click', function logar() {
    let usuario = document.getElementById('campoUsuario').value
    let senha = document.getElementById('campoSenha').value
    let validaLogin = false; 

    for (let i in usuarios) {
        if (usuario == usuarios[i].usuario && senha == usuarios[i].senha) {
            validaLogin = true
            break;
        } else {
            validaLogin = false 
            break;
        }
    }

    if(validaLogin)
        alert('Logado com sucesso')
    else
        alert('Erro ao efetuar o login')
})

