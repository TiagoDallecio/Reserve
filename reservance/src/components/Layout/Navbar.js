import {Link} from 'react-router-dom'
import styles from './Navbar.module.css'
import logo from '../../img/logosemfundo.png'
import Container from './Container'

function Navbar(){

    return(

      <nav className={styles.navbar}>
        <Container>
        <li >
            <Link to="/"><img src={logo} alt="Reservance"/></Link>
          </li>
          <ul className={styles.list}>
          <li className={styles.item}>
            <Link to="/">Home</Link>
          </li >
          <li className={styles.item}>
            <Link to="/Empresa">Empresa</Link>
          </li>
          <li className={styles.item}>
            <Link to="/Contato">Contato</Link>
          </li>
          <li className={styles.item}>
            <Link to="/CriarProjeto">CriarProjeto</Link>
          </li>
          </ul>
          </Container>
      </nav>

    )
}

export default Navbar