/**
 *
 */

$(document).ready(function(){
    $('.nBtn, .table .eBtn').on('click',function (event){
        event.preventDefault();
        var href = $(this).attr('href');
        var text = $(this).text();
        if(text=='Edit') {

            $.get(href, function (place, status) {
                $('.myForm #id').val(place.id);
                $('.myForm #name').val(place.name);
                $('.myForm #location').val(place.location);
                $('.myForm #category_id').val(place.category_id);
            });
            $('.myForm #exampleModal').modal();
        }
        else{
            $('.myForm #name').val('');
        $('.myForm #location').val('');
        $('.myForm #exampleModal').modal();}
    });
    $('.table .delBtn').on('click', function (event){
        event.preventDefault();
        var href = $(this).attr('href');
        $('#exampleModal2 #delRef').attr('href',href);
        $('#exampleModal2').modal();
    });
});