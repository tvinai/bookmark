(function () {

    console.log('hello from bookmark list');

    console.log('hi hi');

    $.ajax({
        url: '/bookmarks',
        method: 'GET'
    }).done(function(data) {
        console.log('Success:', data);
    }).fail(function(jqXHR, textStatus, errorThrown) {
        console.error('Error:', textStatus, errorThrown);
    });

})();
