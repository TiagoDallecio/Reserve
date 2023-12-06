import styles from './FormsReserva.module.css'
import Input from '../form/Input'
import LinkButton from '../Layout/LinkButton';

function FormsReserva(){

    return(
        <>
         <form className={styles.form}>
        <Input type="text" text="Nome" name="nome" placeholder="Insira o seu Nome"/>
        <Input type="text" text="CPF" name="CPF" placeholder="CPF"/>
        <Input type="text" text="e-mail" name="email" placeholder="reservance@reservance.com"/>
        <Input type="text" text="Telefone" name="telefone" placeholder="(--)     -    "/>
        <Input type="text" text="Observação Extra" name="-observacao" placeholder="Este campo é destinado ao estavelecimento"/>
        

        <LinkButton text="Confirmar"/>

        </form>
        
        </>
    )

}

export default FormsReserva 