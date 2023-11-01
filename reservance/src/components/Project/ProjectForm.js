import styles from './ProjectForm.module.css'
import Input from '../form/Input'

function ProjectForm(){

    return(
        <form className={styles.form}>
        <Input type="text" text="Nome do Restaurante" name="Nome" placeholder="Insira o Nome do Restaurante"/>
        <Input type="number" text="Número de mesas" name="NumeroMesas" placeholder="Número de Mesas"/>
        <Input type="datetime-local" text="Dias de funcionamento" name="Nome" placeholder="Funcionamento"/>
        <Input type="time" text="Horário de Abertura" name="Abertura" placeholder="Abertura"/>
        <Input type="time" text="Horário de Fechamento" name="Fechamento" placeholder="Fechamento"/>
        
        <div>
            <select name="category_id">
                <option disabled> Selecione a categoria</option>
            </select>
        </div>
        
        <div>
            <input type="submit" value="Criar Projeto"/>
        </div>

        </form>
    )
}

export default ProjectForm