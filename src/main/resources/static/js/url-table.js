let urlTable = (function () {

    let getTable = function () {

        let $table = $('<table>');

        return $table;
    }

    let getTableHeader = function (text) {

        let $thead = $('<thead>');

        let $tr = $('<tr>');

        let $th = $('<th>', {
            text: text
        });

        $thead.append($tr);
        $tr.append($th);

        return $thead;
    }

    let getTableBody = function () {

        let $tbody = $('<tbody>');

        return $tbody;

    }

    let getTableRow = function ($a) {

        let $tr = $('<tr>');

        let $td = $('<td>');

        $tr.append($td);
        $td.append($a);

        return $tr;
    }

    return {
        getTable: getTable,
        getTableHeader: getTableHeader,
        getTableBody: getTableBody,
        getTableRow: getTableRow
    }

})();
