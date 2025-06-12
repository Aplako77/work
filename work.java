

let searchBtn=document.querySelector('#search-btn');
let searchBar= document.querySelector('.search-bar-container');
let menu=document.queryselector('menu-bar')
let navbar=document.queryselector('.navbar')

window.onscroll= ()=>{
     searchBtn.classlist.remove('fa-times');
    searchBar.classlist.remove('active');
    menu.classlist.remove('active');
    navbar.classlist.remove('active');
}

searchBtn.addeventlistener('click',()=>{
    searchBtn.classlist.toggle('fa-times');
    searchBar.classlist.toggle('active');
});

