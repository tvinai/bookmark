(function () {

    let $bookmarkContainer = $('#bookmark-container');

    let render = function (bookmarks) {

        $bookmarkContainer.empty();

        let i = 0;
        let n = bookmarks.length;
        for (i = 0; i < n; i++) {

            let $link = $('<a>', {
                'href': bookmarks[i].url,
                'text': bookmarks[i].name
            });

            $bookmarkContainer.append($link);

        }

    }

    $.ajax({
        url: '/bookmarks',
        method: 'GET'
    }).done(function(data) {
        console.log('Success:', data);
        render(data);
    }).fail(function(jqXHR, textStatus, errorThrown) {
        console.error('Error:', textStatus, errorThrown);
    });

})();
