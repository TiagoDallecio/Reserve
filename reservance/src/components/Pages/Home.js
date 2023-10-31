import styles from './Home.module.css'
import imagem from '../../img/restaurantecima.png' 
import LinkButton from '../Layout/LinkButton'

function Home(props){

    return(

        <section className={styles.home_container}>
            <h1>
                 <span>Reser</span><span1>vance</span1>
             </h1>    
                <p>A melhor reserva para a melhor experiência!</p>
                <LinkButton to="/CriarProjeto" text="Criar Projeto"/>
                <img src={imagem} alt="Reservance"/>
           

        </section>

    )

}

export default Home