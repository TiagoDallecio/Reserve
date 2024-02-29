import styles from '../Pages/Cardapio.module.css';
import CaixaCardapio from '../Layout/CaixaCardapio';
import imagem from '../../img/pratorestaurante.png';
import imagem1 from '../../img/restaurantecima.png';
import { RiShoppingCartLine } from "react-icons/ri";


const Pratos = [
    {
        id: 1,
        name: "Macarrão",
        descricao: "blablabla",
        preco: "20,00",
        url: imagem
        
    },
    {
        id: 2,
        name: "Risotto",
        descricao: "blablabla",
        preco: "30.00",
        url: imagem1
    },
];

function Cardapio() {
    return (
        <div className={styles.container}>

            <div className={styles.nome}>
                <h1 className={styles.h1}>Restaurante</h1>
                <button type="button" className={styles.cart}> 
                    <RiShoppingCartLine /> 
                    <span className={styles.cartstatus}>1</span>
                </button>
            </div>

                {Pratos.map(prato => (
                    <div className={styles.layout}>
                        <CaixaCardapio key={prato.id} nome={prato.name} descricao={prato.descricao} preco={prato.preco} url={prato.url} />
                    </div>
                ))}
            
        </div>
    );
}

export default Cardapio;