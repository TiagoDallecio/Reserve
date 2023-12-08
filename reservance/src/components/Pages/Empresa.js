import styles from './Empresa.module.css'
import imagem from '../../img/pratorestaurante.png' 
function Empresa(props){

    return(

        <div className={styles.empresa_container}>
        <h1>
            Empresa
        </h1>
        <h2>
            Criação
        </h2>
        <div1>
        <p1> A Reservance, é um projeto idealizado a partir de um projeto de faculdade, do qual, a vontade
            e carinho pela idéia, se externalisou e se concretizou nesta empresa.
        </p1>
        <img  src={imagem}/>
        </div1>
        </div>
        

    )

}

export default Empresa