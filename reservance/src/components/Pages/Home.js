import styles from './Home.module.css'
import imagem from '../../img/pratorestaurante.png' 
import imagem2 from '../../img/restaurantecima2.png'
import imagem3 from '../../img/restaurantecima3.png'
import imagem4 from '../../img/restaurantecima4.png'
import imagem5 from '../../img/restaurantecima5.png'
import imagem6 from '../../img/restaurantecima6.png'

import LinkButton from '../Layout/LinkButton'
import { register } from 'swiper/element/bundle'
import 'swiper/css'
import 'swiper/css/navigation';
import 'swiper/css/pagination';
import 'swiper/css/scrollbar';
import { Swiper, SwiperSlide } from 'swiper/react'
register();

const imagens =[

    { id:'1', image: imagem},
    { id:'2', image: imagem2},
    { id:'3', image: imagem3},
    { id:'4', image: imagem4},
    { id:'5', image: imagem5},
    { id:'6', image: imagem6},

]



function Home(props){

    return(
        <>
        <Swiper
            slidesPerView={1}
            pagination={{ clickable: true }}
            navigation
            >
                {imagens.map( (item) =>(
                    <SwiperSlide key={item.id}>
                        <img src={item.image}
                        alt="slider"
                        className="slider-item"
                        style={{
                            width: '100%',
                            height: '350px',
                            objectFit: 'cover',
                        }}
                        />
                    </SwiperSlide>
                ))}
        </Swiper>
        <section className={styles.home_container}>
            <h1>
                 <span>Reser</span><span1>vance</span1>
             </h1>    
                <p>A melhor reserva para a melhor experiência!</p>
                <LinkButton to="/CriarProjeto" text="Criar Projeto"/>
                <img src={imagem} alt="Reservance"/>
           

        </section>
        </>
    )

}

export default Home