import { FaGithub, FaInstagram, FaLinkedin } from "react-icons/fa";
import styles from './Footer.module.css'

function Footer(){

return(

    <>
    <ul className={styles.social_list}>
        <li>
            <FaGithub/>
        </li>
        <li>
            <FaLinkedin/>
        </li>
        <li>
            <FaInstagram/>
        </li>
    </ul>
    <p>Nossas Redes!</p>
    </>
)

}

export default Footer