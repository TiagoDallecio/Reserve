import styles from './ProjectForm.module.css'
import Input from '../form/Input'
import Select from '../form/Select'
import SubmitButton from '../form/SubmitButton'


function ProjectForm(props){

    return(
        <form className={styles.form}>
        <Input type="text" text="Nome do Restaurante" name="Nome" placeholder="Insira o Nome do Restaurante"/>
        <Input type="number" text="Número de mesas" name="NumeroMesas" placeholder="Número de Mesas"/>
        <Input type="datetime-local" text="Dias de funcionamento" name="Nome" placeholder="Funcionamento"/>
        <Input type="time" text="Horário de Abertura" name="Abertura" placeholder="Abertura"/>
        <Input type="time" text="Horário de Fechamento" name="Fechamento" placeholder="Fechamento"/>
        
        <Select name="category_id" text="Selecione uma categoria"/>

        <SubmitButton text={props.btnText}/>

        </form>
    )
}

export default ProjectForm