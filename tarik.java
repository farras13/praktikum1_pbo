import javax.swing.JOptionPane;
public class tarik{
    private int saldo;
    public void ambil (int tab, int t){
        if (t%100!=0)
        JOptionPane.ShowMessageDialog(null, "Mesin ATM BRI tidak menerima uang koin \nSilahkan ulangi kembali","Transaksi gagal",0);
        else 
            if (t>tab)
                JOption.showMessageDialog(null,"Saldo anda tidak mencukupi \nSilahkan lakukan penyetoran", "Transaksi Gagal",0);
        else if (t<50000)
            JOption.showMessageDialog(null,"Besaran minimal setor tunai adalah Rp 50000,00","ERROR",0);
        else {
            saldo = tab-t;
            JOptionPane.showMessageDialog(null, "Saldo Anda saat ini sebesar : " + saldo);
            if (tab<=50000)
                JOptionPane.showMessageDialog(null,"Saldo minimal harus Rp 50000,00, Segera lakukan penyetoran untuk menghindari penutupan akun.","CAUTION",2)
    }
    }
}
public int getsaldo(){
    retutn saldo;
}