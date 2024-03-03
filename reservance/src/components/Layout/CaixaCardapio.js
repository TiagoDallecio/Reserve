// CaixaCardapio.js
import React, { useState } from 'react';
import styles from '../Layout/CaixaCardapio.module.css';

function CaixaCardapio(props) {
    const [checked, setChecked] = useState(false);
    const [quantidade, setQuantidade] = useState(1);

    const backgroundImageStyle = {
        backgroundImage: `url(${props.url})`
    };

    const handleButtonClick = () => {
        setChecked(!checked);
        if (!checked) {
            props.adicionarAoCarrinho({ ...props, quantidade });
        } else {
            props.removerDoCarrinho(props.id); // Remover do carrinho se já estiver presente
        }
    };

    const handleIncreaseQuantity = () => {
        setQuantidade(quantidade + 1);
    };

    const handleDecreaseQuantity = () => {
        if (quantidade > 1) {
            setQuantidade(quantidade - 1);
        }
    };

    return (
        <div className={styles.caixa}>
            <div className={styles.img} style={backgroundImageStyle}></div>
            <div className={styles.subcaixa}>
                <div className={styles.nome}>{props.nome}</div>
                <div className={styles.descricao}>{props.descricao}</div>
                <div className={styles.barrabaixa}>
                    <div className={styles.buttonContainer}>
                        <button className={`${styles.button} ${checked ? styles.checked : ''}`} onClick={handleButtonClick}>
                            {checked ? <span>&#10003;</span> : <span>+</span>}
                        </button>
                        
                    </div>
                    <div className={styles.preco}>{props.preco},00</div>
                </div>
            </div>
        </div>
    );
}

export default CaixaCardapio;
