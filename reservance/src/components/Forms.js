import { useState } from 'react'

function Forms(){

function CadastrarRestaurante(e){
    e.preventDefault()
    console.log(name)
    console.log("Cadastro com sucesso!")
}

const[name, SetName] = useState()
const[passwoed, SetPassword] = useState()

return(

    <div>
        <h1>
            Cadastro de restaurante:
        </h1>
        <form onSubmit={CadastrarRestaurante}>
            <div>
                <label htmlFor="name">Nome:</label>
                <input type="text" id="name" name="name" placeholder="Nome do Restaurante" onChange={(e) => SetName(e.target.value)}></input>
            </div>
            <div>
                <label htmlFor="password">Senha:</label>
                <input type="password" id="passwoed" name="password" placeholder="Digite a sua Senha" onChange={(e) => SetPassword(e.target.value)}></input>
            </div>
            <div>
                <input type="submit" placeholder="Cadastrar"></input>
            </div>
        </form>

    </div>

)

}

export default Forms