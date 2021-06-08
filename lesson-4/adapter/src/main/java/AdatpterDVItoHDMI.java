public class AdatpterDVItoHDMI implements HDMI {

    private CableDVI cableDVI;

    public AdatpterDVItoHDMI(CableDVI cableDVI) {
        this.cableDVI = cableDVI;
    }

    @Override
    public void doHDMIconnection() {
        this.cableDVI.doConnection();
        this.cableDVI.transferSignal();
    }
}
