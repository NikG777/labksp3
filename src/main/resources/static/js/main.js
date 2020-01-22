/**
 *
 */

$(document).ready(function(){
    $('.nBtn, .table .eBtn').on('click',function (event){
        event.preventDefault();
        var href = $(this).attr('href');
        var text = $(this).text();

        if(text==='Редактировать') {

            $.get(href, function (place, status) {
                if(!$(".myForm #id").length > 0){
                    $('.myForm #delid').append('<input type="number" class="form-control" readonly="readonly" id="id" name = "id" value=""/>');}
                $('.myForm #id').val(place.id);
                console.log(place.difficulty);
                $('.myForm #name').val(place.name);
                $('.myForm #category').val(place.category);
                $('.myForm #difficulty').val(place.difficulty);
                $('.myForm #description').val(place.description);
                $('.myForm #images').val(place.images);
                $('.myForm #guide').val(place.guide);
                $('.myForm #guideVideo').val(place.guideVideo);
                $('.myForm #exercise').val(place.exercise);
            });
            $('.myForm #exampleModal').modal();
        }
        else{
            $('.myForm #id').remove();
            console.log($(".myForm #id").length > 0);
            $('.myForm #name').val('');
            $('.myForm #category').val('');
            $('.myForm #difficulty').val('');
            $('.myForm #description').val('');
            $('.myForm #images').val('');
            $('.myForm #guide').val('');
            $('.myForm #guideVideo').val('');
            $('.myForm #exercise').val('');
            $('.myForm #exampleModal').modal();}
    });
    $('.table .delBtn').on('click', function (event){
        event.preventDefault();
        var href = $(this).attr('href');
        $('#exampleModal2 #delRef').attr('href',href);
        $('#exampleModal2').modal();
    });
});
