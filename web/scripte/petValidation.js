$(document).ready(function () {
    var jVal = {
        "species": function () {
            $('body').append('<div id="speciesInfo" class="info"></div>');
            var speciesInfo = $('#speciesInfo');
            var ele = $('#species');
            var pos = ele.offset();
            speciesInfo.css({
                top: pos.top - 3,
                left: pos.left + ele.width() + 15
            });
            if (ele.val().length < 3) {
                jVal.errors = true;
                speciesInfo.removeClass('correct').addClass('error').html('long').show();
                ele.removeClass('wrong').addClass('normal');
            } else {
                speciesInfo.removeClass('error').addClass('correct').html('ok').show();
                ele.removeClass('wrong').addClass('normal');
            }
        },
        "alias": function () {
            $('body').append('<div id="aliasInfo" class="info"></div>');
            var aliasInfo = $('#aliasInfo');
            var ele = $('#alias');
            var pos = ele.offset();
            aliasInfo.css({
                top: pos.top - 3,
                left: pos.left + ele.width() + 15
            });
            if (ele.val().length < 4) {
                jVal.errors = true;
                aliasInfo.removeClass('correct').addClass('error').html('long').show();
                ele.removeClass('wrong').addClass('normal');
            } else {
                aliasInfo.removeClass('error').addClass('correct').html('ok').show();
                ele.removeClass('wrong').addClass('normal');
            }
        },
        "age": function () {
            $('body').append('<div id="ageInfo" class="info"></div>');
            var ageInfo = $('#ageInfo');
            var ele = $('#age');
            var pos = ele.offset();
            ageInfo.css({
                top: pos.top - 3,
                left: pos.left + ele.width() + 15
            });
            if (ele.val().length > 2) {
                jVal.errors = true;
                ageInfo.removeClass('correct').addClass('error').html('long').show();
                ele.removeClass('wrong').addClass('normal');
            } else {
                ageInfo.removeClass('error').addClass('correct').html('ok').show();
                ele.removeClass('wrong').addClass('normal');
            }
        },
        'sendIt': function () {
            if (!jVal.errors) {
                $('#jform').submit();
            }
        }
    };
    // _________________________

    $('#send').click(function () {
        var obj = $.browser.webkit ? $('body') : $('html');
        obj.animate({scrollTop: $('#jform').offset().top()}, 750, function () {
            jVal.errors = false;
            jVal.species();
            jVal.alias();
            jVal.age();
            jVal.sendIt();
        });
        return false;
    });
    $('#species').change(jVal.species);
    $('#alias').change(jVal.alias);
    $('#age').change(jVal.age);
});
