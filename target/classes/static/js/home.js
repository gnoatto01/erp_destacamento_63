//dar efeito de selecionado para os itens
var itemMenu = document.querySelectorAll('.item-menu')

function selecionarLink(){
    itemMenu.forEach((item)=>
        item.classList.remove('ativo')
    )
    this.classList.add('ativo')
}

itemMenu.forEach((item)=>
    item.addEventListener('click',selecionarLink)
)

//Expandir menu

var btnExpandir = document.querySelector('#btn-expandir')
var menu = document.querySelector('.menu-lateral')

btnExpandir.addEventListener('click',function(){
    menu.classList.toggle('expandir')
})