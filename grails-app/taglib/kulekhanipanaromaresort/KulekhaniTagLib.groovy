package kulekhanipanaromaresort

class KulekhaniTagLib {

    def formatDate ={attrs ->
        def date = attrs.get('date')

        if(!date)
        {
            date = new Date();
        }
        def format = attrs.get('format')
        if (!format)
        {
            format = "yyy-MM-dd"
        }
        out << new java.text.SimpleDateFormat(format).format(date)
    }


}
