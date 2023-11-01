import ProjectForm from '../Project/ProjectForm'
import styles from './CriarProjeto.module.css'

function CriarProjeto(props){

    return(

        <div className={styles.criarprojeto_container}>
            <h1 className={styles.criarprojeto_container}>CriarProjeto</h1>
            <p className={styles.criarprojeto_container}>
                Mapeie seu restaurante, para um imersão total do cliente!</p>
            <ProjectForm />

        </div>
    )

}

export default CriarProjeto
