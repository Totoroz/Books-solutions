

public class StringMergeSorterDemo {
    public static void main(String[] args) {
        String[] array = new String[] { "amKucbubyAnWhV", "ZGRAVjhdWdnHPv", "rieGweLclEAdTb", "IGNLbuRzKeifuf",
                "BqrXjNKPBzdNOO", "iYEzsAkEWXRTwL", "XrstJUnBIVgwbi", "jCtZGPaAsZbSpZ", "WNRDYvxAImnlVn",
                "uwRIypXqfoPbkK", "TQIRgAbepWXhPj", "KucgxsBWCFntte", "yffiTWyfZFiYzK", "OHjhAmBrgHrtdh",
                "GptFEFTWnlEHiU", "kcZxkFUGnrpmXK", "PFzqJEPmzkibQq", "RjbzHJjgVfIUbk", "dEoTdbCgKdskyw",
                "tziXFaOtFybviW", "hKOclOgUcbLWZJ", "SDFAsKwlNjVOgu", "qfGOrGpBgxgmLw", "DeSoZDubfVAbjr",
                "SSVfkhFpXSMvyl", "pNdrQyJRTkANgn", "fiNoYlSmOburLY", "fQRkoFOmjjymSK", "jWihBAoSVgGwvG",
                "gQNEkIhMnfvznp", "rBawmWxiuGNvSo", "wtzzDmwidsqCbP", "zQIjeCfKjtXIfD", "WxNjtctEBmQVQF",
                "EUOoIobIxiFGAz", "CfQEsBhJcGooRX", "QMEJcltpjXCpSc", "wmBpQcSgpFHzom", "oprAMRLQrDHoFP",
                "tPBJoAtDRUXdlX", "NpgGXNYxjTSijI", "GwIYbUPcyWsHQf", "SkplCFnvQSUfAZ", "ivyqMtLCQwFVkC",
                "mtzZhMUDyjvBrA", "oHfjzRpsNQKWOd", "AtqromKfFgHlSQ", "wcFFOxsqNvnaYz", "fsTTfKWvTLotYu",
                "TVOddiBqqrLWvb" };
        StopWatch stopwatch = new StopWatch();
        stopwatch.start();
        StringMergeSorter.sort(array);
        stopwatch.stop();
        stopwatch.showElapsedTime();
        for (String string : array) {
            System.out.println(string);
        }
    }
}
