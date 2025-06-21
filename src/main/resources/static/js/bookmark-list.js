(function () {

    let $bookmarkContainer = $('#bookmark-container');

    let render = function (bookmarks) {

        $bookmarkContainer.empty();

        $table = urlTable.getTable();
        $tableHeader = urlTable.getTableHeader('BOOKMARKS');
        $tableBody = urlTable.getTableBody();

        let i = 0;
        let n = bookmarks.length;
        for (i = 0; i < n; i++) {

            let $link = $('<a>', {
                'href': bookmarks[i].url,
                'text': bookmarks[i].name,
                'target': '_blank'
            });

            let $tableRow = urlTable.getTableRow($link);
            $tableBody.append($tableRow);

        }

        $table.append($tableHeader);
        $table.append($tableBody);

        $bookmarkContainer.append($table);

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
