package kz.tutorial.jsonplaceholdertypicode.presentation.albums

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import kz.tutorial.jsonplaceholdertypicode.R

class AlbumsFragment : Fragment(R.layout.fragment_albums) {

    lateinit var ivImage: ImageView

    //0. Создаем item_album, где отрисовываем с дизайна верстку альбома для списка
    //Создаем AlbumViewHolder, который в bind принимает Album и
    // с помощью Glide заливаем изображение (инструкция ниже) и ассайним остальные данные
    // Также не забываем itemClickListener привязать
    // Далее делаем сам адаптер

    //1. Сначала создайте вьюмодел которая использует GetAlbumsUseCase.
    //Не забываем использовать di
    //Внедряем сюда viewModel
    //Следим за liveData и при получении данных
    // отправляем данные в адаптер, который мы засэтапили на предыдущем шаге

    //2. Подключаем обработчик нажатия и пока оставляем пустым.
    // После, при создании PhotosFragment заинтегрируйте его в обработку клика

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        assignViews(view)
    }

    private fun assignViews(view: View) {
        ivImage = view.findViewById(R.id.iv_image)

        //Пример пользования глайдом. Здесь не надо заморачиваться насчет корутин и прочего
        //Глайд сам занимается этим
        //Вам лишь нужно соблюдать шаблон
        //Код ниже нужно будет потом убрать
        val imageUrl =
            "https://images.genius.com/2b790e48bcd9779bce4dc5bc74a01118.563x1000x1.png"
        Glide.with(this)
            .load(imageUrl)
            .into(ivImage)
    }

}