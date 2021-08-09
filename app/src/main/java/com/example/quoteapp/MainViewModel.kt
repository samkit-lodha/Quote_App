package com.example.quoteapp

import androidx.lifecycle.ViewModel

class MainViewModel(var counter : Int) : ViewModel(){

    val quoteList = listOf<Quote>(
        Quote("It ain't that you don't know that gets you in trouble,It is what you know that just ain't so.","Mark Twain"),
        Quote("An eye for eye only ends up making the whole world blind.","Mahatma Gandhi"),
        Quote("Injustice anywhere is a threat to justice everywhere.","Martin Luther King"),
        Quote("The man who does not read good books has no advantage over the man who cannot read them.","Abrahem Lincoln"),
        Quote("Before you leave the house, look in the mirror and remove one accessory.","Coco Chanel"),
        Quote("When the going gets tough, the tough get going. ","Joe Kennedy"),
        Quote("You only live once, but if you do it right, once is enough.","Mae West"),
        Quote("Get busy living or get busy dying.","Stephen King"),
        Quote("Strive not to be a success, but rather to be of value.","Albert Einstein"),
        Quote("Whenever you find yourself on the side of the majority, it is time to pause and reflect.","Mark Twain")
    )

    var index : Int = counter

    fun increment(){
        index = (index + 1) % quoteList.size
    }

    fun decrement(){
        index = (index - 1 + quoteList.size) % quoteList.size
    }
}